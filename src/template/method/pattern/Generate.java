package template.method.pattern;

public class Generate extends Task{

    public Generate() {}

    public Generate(AuditTrail auditTrail) {
        super(auditTrail);
    }
    @Override
    protected void doExecute() {
        System.out.println("generate execute");
    }

//    AuditTrail auditTrail;
//    public Generate(AuditTrail auditTrail) {
//        this.auditTrail = auditTrail;
//    }
//
//    public void execute() {
//        auditTrail.record();
//
//        System.out.println("execute generating task");
//    }


}
