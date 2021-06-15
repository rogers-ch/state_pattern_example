package states;

import context.H20;

public class LiquidState implements IState
{
    private H20 context;

    public LiquidState(H20 context)
    {
        this.context = context;
    }

    @Override
    public void melt()
    {
        System.out.println("I am already liquid water! I can't melt!");
    }

    @Override
    public void freeze()
    {
        context.setSteam(false);
        context.setIce(true);
        context.setLiquidWater(false);
        System.out.println("Liquid water has frozen!");
        context.setTemp(-1);
        context.setState(context.getSolid());
    }

    @Override
    public void boil()
    {
        context.setSteam(true);
        context.setIce(false);
        context.setLiquidWater(false);
        System.out.println("Liquid water has boiled!");
        context.setTemp(101);
        context.setState(context.getGas());
    }

    @Override
    public void condense()
    {
        System.out.println("I'm liquid water! I can't condense!");
    }

    @Override
    public String toString()
    {
        return "Liquid";
    }
}
