package co.edu.eafit.dis.st0270.s20201.nano.grammar;

public enum PilotStateEnum {

    I0(true),
    I1(),
    I2(),
    I3(true),
    I4(),
    I5(true),
    I6(),
    I7(true),
    I8(),
    I9(true),
    I10(),
    I11(),
    I12(),
    I13(),
    I14(),
    I15(),
    I16();
    private boolean reduction = false;

    PilotStateEnum(boolean reduction) {
	this.reduction = reduction;
    }

    PilotStateEnum() {
    }

    public boolean isAReductionState() {
	return reduction;
    }
}
