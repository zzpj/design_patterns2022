# Design Patterns
## Singleton

```java
public class Config {
    private static Config config;
    private Config() {
    }
    public static synchronized Config getInstance() {

        if (config == null) {
            config = new Config();
        }
        return config;
    }
}
```

```java
public class ConfigTest {
    @Test
    public void shouldBeOneInstance() {
        Config config = Config.getInstance();
        Config config1 = Config.getInstance();
        assertEquals(config, config1);
    }
}
```

```java
Runnable runnable1 = () -> config1 = Config.getInstance();
Runnable runnable2 = () -> config2 = Config.getInstance();

int success = 0;
int fail = 0;

for (int i = 0; i < 10_000; i++) {
    ExecutorService executorService = Executors.newFixedThreadPool(2);
    executorService.submit(runnable1);
    executorService.submit(runnable2);
    executorService.shutdown();
    executorService.awaitTermination(1, TimeUnit.SECONDS);

    if (config1.equals(config2)) {
        success++;
    } else {
        fail++;
    }
}
System.out.println("success " + success);
System.out.println("fail " + fail);
```
## Builder
```java
public class BuildingBuilder {
    private Long id;
    private String streetName;
    private int streetNumber;
    private String zipCode;
    private String buildingCompanyName;
    private String landlordName;
    private Date constructionYear;
    private Date constructionEndYear;
    private long flatsNumber;
    private long completeRentArea;
    private String completeRentAreaUnit;
    private Map<String, String> flatsDescription;
    private Map<String, Long> flatsPrices;
    private boolean hasCarPark;
    private boolean hasGarden;
    private boolean hasFence;
    private boolean petFriendlyFlag;
    private boolean commercialGroundFloorFlag;

    public BuildingBuilder setId(Long id) {
        this.id = id;
        return this;
    }

    public BuildingBuilder setStreetName(String streetName) {
        this.streetName = streetName;
        return this;
    }

    public BuildingBuilder setStreetNumber(int streetNumber) {
        this.streetNumber = streetNumber;
        return this;
    }

    public BuildingBuilder setZipCode(String zipCode) {
        this.zipCode = zipCode;
        return this;
    }

    public BuildingBuilder setBuildingCompanyName(String buildingCompanyName) {
        this.buildingCompanyName = buildingCompanyName;
        return this;
    }

    public BuildingBuilder setLandlordName(String landlordName) {
        this.landlordName = landlordName;
        return this;
    }

    public BuildingBuilder setConstructionYear(Date constructionYear) {
        this.constructionYear = constructionYear;
        return this;
    }

    public BuildingBuilder setConstructionEndYear(Date constructionEndYear) {
        this.constructionEndYear = constructionEndYear;
        return this;
    }

    public BuildingBuilder setFlatsNumber(long flatsNumber) {
        this.flatsNumber = flatsNumber;
        return this;
    }

    public BuildingBuilder setCompleteRentArea(long completeRentArea) {
        this.completeRentArea = completeRentArea;
        return this;
    }

    public BuildingBuilder setCompleteRentAreaUnit(String completeRentAreaUnit) {
        this.completeRentAreaUnit = completeRentAreaUnit;
        return this;
    }

    public BuildingBuilder setFlatsDescription(Map<String, String> flatsDescription) {
        this.flatsDescription = flatsDescription;
        return this;
    }

    public BuildingBuilder setFlatsPrices(Map<String, Long> flatsPrices) {
        this.flatsPrices = flatsPrices;
        return this;
    }

    public BuildingBuilder setHasCarPark(boolean hasCarPark) {
        this.hasCarPark = hasCarPark;
        return this;
    }

    public BuildingBuilder setHasGarden(boolean hasGarden) {
        this.hasGarden = hasGarden;
        return this;
    }

    public BuildingBuilder setHasFence(boolean hasFence) {
        this.hasFence = hasFence;
        return this;
    }

    public BuildingBuilder setPetFriendlyFlag(boolean petFriendlyFlag) {
        this.petFriendlyFlag = petFriendlyFlag;
        return this;
    }

    public BuildingBuilder setCommercialGroundFloorFlag(boolean commercialGroundFloorFlag) {
        this.commercialGroundFloorFlag = commercialGroundFloorFlag;
        return this;
    }

    public Building createBuilding() {
        return new Building(id, streetName, streetNumber, zipCode);
    }
}
```

## Factory
```java
public interface Report {
Page createNewPage();
    Table createNewTable(int columns, int rows);
    Cell createNewCell();
}

class Page { }

class Table {
int columns;
int rows;
    Table(int columns, int rows) {
        this.columns = columns;
        this.rows = rows;
    }
}
class Cell { }
```

```java
public class HTMLReport implements Report {

    @Override
    public Page createNewPage() {
        System.out.println("creating new page inside html report");
        return new Page();
    }

    @Override
    public Table createNewTable(int columns, int rows) {
        System.out.println("creating new table inside html report, cells = " + columns + " rows = " + rows);
        return new Table(columns, rows);
    }

    @Override
    public Cell createNewCell() {
        System.out.println("creating new cell inside html report");
        return new Cell();
    }
}
```

```java
public class PdfReport implements Report {

    @Override
    public Page createNewPage() {
        System.out.println("creating new page inside pdf report");
        return new Page();
    }

    @Override
    public Table createNewTable(int columns, int rows) {
        System.out.println("creating new table inside pdf report, columns = " + columns + " rows = " + rows);
        return new Table(columns, rows);
    }

    @Override
    public Cell createNewCell() {
        System.out.println("creating new cell inside pdf report");
        return new Cell();
    }
}
```

```java
public interface ReportGenerator {
    Report generateReport(int cells, int rows);
}
```

```java
public class HTMLReportGenerator implements ReportGenerator {
    @Override
    public Report generateReport(int cells, int rows) {
        return new HTMLReport();
    }
}
```

```java
public class PdfReportGenerator implements ReportGenerator {
    @Override
    public Report generateReport(int cells, int rows) {
        return new PdfReport();
    }
}
```

```java
Report report;
ReportGenerator factory;

String s = "pdf";
if (s.equals("pdf")) {
    factory = new PdfReportGenerator();
    report = factory.generateReport(10, 20);
} else {
    factory = new HTMLReportGenerator();
    report = factory.generateReport(40, 30);
}

report.createNewPage();
report.createNewCell();
report.createNewTable(30, 30);
```

## Strategy
```java
public interface SearchStrategy {
    int findElementIndex(List<String> elements, String element);
}

class BinarySearchStrategy implements SearchStrategy {

    @Override
    public int findElementIndex(List<String> elements, String element) {
        return Collections.binarySearch(elements, element);
    }
}

class LinearSearchStrategy implements SearchStrategy {

    @Override
    public int findElementIndex(List<String> elements, String element) {
        return elements.indexOf(element);
    }
}

class ElementFinder {

    SearchStrategy searchStrategy;

    public ElementFinder(SearchStrategy searchStrategy) {
        this.searchStrategy = searchStrategy;
    }

    public int findElement(List<String> elements, String element) {
        return searchStrategy.findElementIndex(elements, element);
    }
}
```

```java
class ElementFinderTest {

    List<String> words = Stream.of("aa", "bb", "cc", "dd", "ee").toList();

    ElementFinder elementFinder;

    @ParameterizedTest
    @CsvSource({"dd, 3", "ee, 4"})
    public void shouldCheckLinearSearch(String word, int index) {

        elementFinder = new ElementFinder(new LinearSearchStrategy());
        int actualIndex = elementFinder.findElement(words, word);
        assertEquals(index, actualIndex);

    }

    @ParameterizedTest
    @CsvSource({"aa, 0", "ee, 4"})
    public void shouldCheckBinarySearch(String word, int index) {

        elementFinder = new ElementFinder(new BinarySearchStrategy());
        int actualIndex = elementFinder.findElement(words, word);
        assertEquals(index, actualIndex);

    }
}
```
## Proxy
```java
public class Image implements Imageable {

    private String name;
    private int height;
    private int width;
    private String author;
    private String extension;
    private Long size;
    private List<String> tags;
    private LocalDateTime createDate;
    private LocalDateTime updateDate;
    private String imageRepresentation;
    private String filepath;

    public Map<String, Object> getHeaders() {
        return headers;
    }

    private Map<String, Object> headers;

    public Image(String name, int height, int width, String author, String extension, Long size, List<String> tags, LocalDateTime createDate, LocalDateTime updateDate, String imageRepresentation, String filepath) {
        this.name = name;
        this.height = height;
        this.width = width;
        this.author = author;
        this.extension = extension;
        this.size = size;
        this.tags = tags;
        this.createDate = createDate;
        this.updateDate = updateDate;
        this.imageRepresentation = imageRepresentation;
        this.filepath = filepath;
    }

    void initHeaders() throws IllegalAccessException {

        System.out.println("preparing headers..." + this.name);
        headers = new HashMap<>();
        Field[] declaredFields = this.getClass().getDeclaredFields();
        for (int i = 0; i < declaredFields.length; i++) {
            declaredFields[i].setAccessible(true);
            headers.put(declaredFields[i].getName(), declaredFields[i].get(this));
        }
    }

    @Override
    public Map<String, Object> getImageHeaders() {
        if (headers == null) {
            System.out.println("not headers map!");
            return Collections.emptyMap();
        }


        System.out.println("displaying headers " + headers.get("name") + " " + headers);
        return headers;
    }
}
```

```java
public interface Imageable {
    Map<String, Object> getImageHeaders();
}
```

```java
public class ImageProxy implements Imageable {

    private Image image;

    public ImageProxy(Image image) {
        this.image = image;
    }

    @Override
    public Map<String, Object> getImageHeaders() {

        if (image.getHeaders() == null) {
            try {
                image.initHeaders();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }

        return image.getImageHeaders();
    }
}
```

```java
public class App {
    public static void main(String args[]) {

        Image image1 = new Image("aa", 2,3,
                "a","jpg", 33l, Collections.emptyList(), LocalDateTime.now(), LocalDateTime.now(), "abc", "usr/dd/jpg");
        Image image2 = new Image("aabb", 2,3,
                "aeee","jpg", 323l, Collections.emptyList(), LocalDateTime.now(), LocalDateTime.now(), "abc", "usr/dd/jpg");

        Imageable imageproxy1 = new ImageProxy(image1);
        Imageable imageProxy2 = new ImageProxy(image2);

        imageproxy1.getImageHeaders();
        imageproxy1.getImageHeaders();
        imageProxy2.getImageHeaders();
        imageproxy1.getImageHeaders();
        imageProxy2.getImageHeaders();
    }
}
```