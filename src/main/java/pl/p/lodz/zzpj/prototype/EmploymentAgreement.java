package pl.p.lodz.zzpj.prototype;

public class EmploymentAgreement extends AgreementPrototype{
    private String employer;
    private String employee;

    public EmploymentAgreement() {
    }

    public EmploymentAgreement(EmploymentAgreement target) {
        super(target);
        if(target != null) {
            this.employer = target.getEmployer();
            this.employee = target.getEmployee();
        }
    }

    @Override
    public AgreementPrototype clone() {
        return  new EmploymentAgreement(this);
    }

    public String getEmployer() {
        return employer;
    }

    public void setEmployer(String employer) {
        this.employer = employer;
    }

    public String getEmployee() {
        return employee;
    }

    public void setEmployee(String employee) {
        this.employee = employee;
    }
}
