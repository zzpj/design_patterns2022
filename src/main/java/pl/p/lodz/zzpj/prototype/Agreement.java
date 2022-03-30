package pl.p.lodz.zzpj.prototype;

import java.util.List;

public abstract class Agreement{

    private List<String> signatures;
    private String pattern;

    public Agreement(Agreement agreement) {
        if(agreement != null) {
            this.signatures = agreement.signatures;
            this.pattern = agreement.pattern;
        }
    }

    public List<String> getSignatures() {
        return signatures;
    }

    public void setSignatures(List<String> signatures) {
        this.signatures = signatures;
    }

    public String getPattern() {
        return pattern;
    }

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }

    public Agreement() {
    }

    public abstract Agreement clone();

    public void sign() {
         signatures.stream().forEach(ch -> pattern += "Signed by: " + ch +", " );
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Agreement agreement = (Agreement) o;
        if (signatures != null ? !signatures.equals(agreement.signatures) : agreement.signatures != null) return false;
        return pattern != null ? pattern.equals(agreement.pattern) : agreement.pattern == null;
    }
}
