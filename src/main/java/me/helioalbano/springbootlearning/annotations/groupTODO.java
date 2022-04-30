package me.helioalbano.springbootlearning.annotations;

public @interface groupTODO {
    public enum Severity { CRITICAL, IMPORTANT, TRIVIAL, DOCUMENTATION };
    Severity severity() default Severity.IMPORTANT;
    String item();
    String assignedTo();
}
