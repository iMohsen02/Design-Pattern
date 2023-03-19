package template.method.pattern;

public class Transform extends Task {

    public Transform() {}

    public Transform(AuditTrail auditTrail) {
        super(auditTrail);
    }
    @Override
    protected void doExecute() {
        System.out.println("transform execute");
    }


//    AuditTrail auditTrail;
//
//    public Transform(AuditTrail auditTrail) {
//        this.auditTrail =auditTrail;
//    }
//
//    public void execute() {
//        auditTrail.record();
//
//        System.out.println("transform execute");
//    }
}
