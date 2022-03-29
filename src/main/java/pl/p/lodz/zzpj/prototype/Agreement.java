package pl.p.lodz.zzpj.prototype;
import java.time.LocalDate;
import java.util.Date;
import java.util.Objects;

public abstract class Agreement {

    private String governingBody;
    private String id;
    private LocalDate startDate;
    private LocalDate endDate;
    private String firstParty;
    private String secondParty;


    public Agreement() {
    }

    public Agreement(Agreement t) {
        this.id = t.id;
        this.firstParty = t.firstParty;
        this.secondParty = t.secondParty;
        this.governingBody = t.governingBody;
        this.startDate = t.startDate;
        this.endDate = t.endDate;
    }


    public abstract Agreement clone();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstParty() {
        return firstParty;
    }

    public void setFirstParty(String firstParty) {
        this.firstParty = firstParty;
    }

    public String getSecondParty() {
        return secondParty;
    }

    public void setSecondParty(String secondParty) {
        this.secondParty = secondParty;
    }

    public String getGoverningBody() {
        return governingBody;
    }

    public void setGoverningBody(String governingBody) {
        this.governingBody = governingBody;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "Agreement: " +
                "governingBody='" + governingBody + '\'' +
                ", id='" + id + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", firstParty='" + firstParty + '\'' +
                ", secondParty='" + secondParty + '\'';
    }
}
