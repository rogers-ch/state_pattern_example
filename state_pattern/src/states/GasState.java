package states;

import context.H20;

public class GasState implements IState
{
    private H20 context;

    public GasState(H20 water)
    {
        this.context = water;
    }

    @Override
    public void melt()
    {
        System.out.println("I'm a gas! I can't melt!");
    }

    @Override
    public void freeze()
    {
        System.out.println("I'm a gas! Condense me first!");
    }

    @Override
    public void boil()
    {
        System.out.println("I'm already a gas! I can't boil!");
    }

    @Override
    public void condense()
    {
        context.setSteam(false);
        context.setIce(false);
        context.setLiquidWater(true);
        System.out.println("Gas has condensed! I'm liquid water now!");
        context.setTemp(99);
        context.setState(context.getLiquid());
    }

    @Override
    public String toString()
    {
        return "Gas";
    }

}
