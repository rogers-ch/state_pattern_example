package states;

import context.H20;

public class SolidState implements IState
{
    private H20 context;

    public SolidState(H20 context)
    {
        this.context = context;
    }

    @Override
    public void melt()
    {
        context.setSteam(false);
        context.setIce(false);
        context.setLiquidWater(true);
        System.out.println("Ice has melted!");
        context.setTemp(1);
        context.setState(context.getLiquid());
    }

    @Override
    public void freeze()
    {
        System.out.println("I am already ice! You can't freeze me!");
    }

    @Override
    public void boil()
    {
        System.out.println("I am ice! Melt me before trying to boil!");
    }

    @Override
    public void condense()
    {
        System.out.println("I am ice! I can't condense!");
    }

    @Override
    public String toString()
    {
        return "Solid";
    }
}
