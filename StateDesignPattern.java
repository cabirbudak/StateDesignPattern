package DesignPatterns01;

public class StateDesignPattern {
    public static void main(String[] args) {
        SmartTv smartTv = new SmartTv();
        SmartTvState smartTvSwitchOnState = new SmartTvSwitchOnState();
        SmartTvState smartTvSwitchOffState = new SmartTvSwitchOffState();

        smartTv.setSmartTvState(smartTvSwitchOnState);
        smartTv.switchOnOffSmartTv();

        smartTv.setSmartTvState(smartTvSwitchOffState);
        smartTv.switchOnOffSmartTv();
    }
}
