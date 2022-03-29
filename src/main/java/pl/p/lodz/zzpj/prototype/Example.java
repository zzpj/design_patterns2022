package pl.p.lodz.zzpj.prototype;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Example {

    public static void main(String[] args) {
        List<Agreement> agreements = new ArrayList<>();

        Warranty warranty = new Warranty();
        warranty.setWarrantedObject("violin");
        warranty.setId("12345");
        warranty.setStartDate(LocalDate.parse("2020-01-01"));
        warranty.setEndDate(LocalDate.parse("2020-06-01"));
        warranty.setFirstParty("Angelica Longfield");
        warranty.setSecondParty("Tim Brown");
        warranty.setGoverningBody("something");

        Contract contract = new Contract();
        contract.setContractObject("job");
        contract.setId("678910");
        contract.setStartDate(LocalDate.parse("2022-03-01"));
        contract.setEndDate(LocalDate.parse("2022-08-01"));
        contract.setFirstParty("John Doe");
        contract.setSecondParty("Tommy Black");
        contract.setGoverningBody("something2");

        agreements.add(contract);
        agreements.add(warranty);

        cloneTest(agreements);
    }

    private static void cloneTest(List<Agreement> agreements) {
        List<Agreement> clonedAgreements = new ArrayList<>();

        for (Agreement agreement : agreements) {
            clonedAgreements.add(agreement.clone());
        }

        for (int i = 0; i < agreements.size(); i++) {
            System.out.println("Umowa " + agreements.get(i).toString() + "\nKopia " + clonedAgreements.get(i).toString());
        }
    }
}
