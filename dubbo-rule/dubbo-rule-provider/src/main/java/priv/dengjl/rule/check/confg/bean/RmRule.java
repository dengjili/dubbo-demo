package priv.dengjl.rule.check.confg.bean;

public class RmRule {
    private Integer id;

    private String name;

    private String clazz;

    private String status;

    private String remarks;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getClazz() {
        return clazz;
    }

    public void setClass(String clazz) {
        this.clazz = clazz == null ? null : clazz.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }
}