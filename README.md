# :: Design Patterns

## Wzorce konstrukcyjne 
### Zadanie 1.1 Singleton
Zadaniem jest stworzenie jedynej instacji danej klasy za pomocą wzorca Singleton. Należy zrobić to za pomocą 
inicjalizacji zachłannej albo leniwej (eager vs lazy). Oprócz tego należy również zabezpieczyć się przed 
możliwością kilkukrotnej inicjalizacji obiektu za pomocą wielu wątków. Przygotować jeden test potwierdzający, 
że mamy stworzoną jedną instancję tego samego obiektu. 

Rozwiązanie należy umieścić w klasach `pl.p.lodz.zzpj.singleton.Config`, `pl.p.lodz.zzpj.App` oraz `pl.p.lodz.zzpj.singleton.ConfigTest`


### Zadanie 1.2 Builder
Klasa modelowa reprezentująca budynek ma kilka konstruktorów. Niestety, aby stworzyć obiekt z parametrami, które 
nas interesują, jesteśmy zmuszeni tworzyć kolejne kombinacje konstruktorów. Rozwiązaniem tego problemu jest 
zastosowanie wzorca budowniczego. 

Rozwiązanie należy umieścić w klasie `pl.p.lodz.zzpj.builder.BuildingBuilder`


### Zadanie 1.3 Fabryka
Obsługa generowania raportów w wielu formatach (HTML, PDF, XLS, XML). Każdy format posiada swoją własną 
fabrykę, która tworzy elementy takie jak: nowa strona, tabela, a tabela komórki tabeli. Tak więc każdy format 
zawiera rodzinę zależnych od siebie elementów (nie można przecież łączyć użycia komórek w formacie XLS i PDF w 
raporcie HTML).

Rozwiązanie należy umieścić w pakiecie `pl.p.lodz.zzpj.factory`

### Zadanie 1.4 Prototyp
Mamy różne rodzaje umów (Agreements). Wszystkie te rodzaje mają ten sam wzór (prototyp), z którego są pobierane i następnie wypełniene.
Należy użyć wzorca prototypu do ukazania tego procesu wytwórczego. 

Rozwiązanie należy umieścić w pakiecie `pl.p.lodz.zzpj.prototype`


## Wzorce behawioralne

### Zadanie 2.1 Strategia
Zaproponuj implementację, z użyciem wzorca strategii. Aplikacja wyszukuje podany element w kolekcji za pomocą 
algorytmów wyszukiwania: binarnego i liniowego.

Rozwiązanie należy umieścić w pakiecie `pl.p.lodz.zzpj.strategy`

### Zadanie 2.2 Łańcuch zobowiązań
Zaproponuj implementację analizy przepływu danych przesłanych od użytkownika.
Przykładowy proces: Najpierw użytkownik musi być zaautentykowany, następnie zaaktoryzowany i na 
końcu dane powinny zostać poddane walidacji. 

Rozwiązanie należy umieścić w pakiecie `pl.p.lodz.zzpj.chain`

### Zadanie 2.3 Obserwator
Polska Agencja Prasowa często jako pierwsza informuje o wydarzeniach z Polski i ze świata. To z niej osoby 
odpowiedzialne za aktualizację tzw. pasków w telewizjach informacyjnych (TVP Info, TVN24 czy Polsat News) 
czerpią informację, która pojawia się potem w niedługim czasie na ekranach telewizorów. Zaimplementuj 
przedstawianą sytuację za pomocą wzorca obserwatora. 

Rozwiązanie należy umieścić w pakiecie `pl.p.lodz.zzpj.observer`

### Zadanie 2.4 Metoda szablonowa (Template)
Zaproponować mechanizm logowania się użytkownika z wykorzystaniem autentykacji i autoryzacji się przez Facebooka/Twittera/Gmaila.

Rozwiązanie należy umieścić w pakiecie `pl.p.lodz.zzpj.template`


## Wzorce strukturalne 
### Zadanie 3.1 Proxy 
Załóżmy, że mamy klasę `Image`, która reprezentuje obrazek wraz z ogólnymi informacjami na jego temat (nazwa pliku, długość, wysokość, 
autor, rozszerzenie, rozmiar, tablice z kanałami kolorów, tagi, data stworzenia i ostatniej modyfikacji). Należy użyć wzorca Proxy, który zapewni
szybki dostęp do tych informacji, bez potrzeby ponownych inicjalizacji obiektów klasy `Image` dla tych obrazków, dla których zrobilismy to juz wcześniej.

Rozwiązanie należy umieścić w pakiecie `pl.p.lodz.zzpj.proxy`

### Zadanie 3.2 Adapter
Mamy dwie aplikacje, które służą do odtwarzania plików multimedialnych. Chcielibyśmy używać tylko  jednego z nich, 
który odtworzy nam wszystkie preferowane przez nas formaty.   

Rozwiązanie należy umieścić w pakiecie `pl.p.lodz.zzpj.adapter`
