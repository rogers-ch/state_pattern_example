package context;

import states.GasState;
import states.IState;
import states.LiquidState;
import states.SolidState;

//This is our Context class
public class H20
{
    private int tempC;
    private boolean isIce;
    private boolean isLiquidWater;
    private boolean isSteam;

    private IState solid;
    private IState liquid;
    private IState gas;
    private IState currentState;

    public H20(int tempC) {
        this.tempC = tempC;

        //Note: The conditional logic in the constructor is only used
        //      to determine initial state based on temp.
        if (tempC < 0)
        {
            this.currentState = new SolidState(this);
            this.isIce = true;
            this.isLiquidWater = false;
            this.isSteam = false;
        }
        else if (tempC < 100)
        {
            this.currentState = new LiquidState(this);
            this.isIce = false;
            this.isLiquidWater = true;
            this.isSteam = false;
        }
        else
        {
            this.currentState = new GasState(this);
            this.isIce = false;
            this.isLiquidWater = false;
            this.isSteam = true;
        }

        this.solid = new SolidState(this);
        this.liquid = new LiquidState(this);
        this.gas = new GasState(this);
    }

    //The following four methods (melt(), freeze(), boil(), and condense())
    // delegate state behavior by calling the corresponding methods in the
    // currentState object.
    public void melt()
    {
        currentState.melt();
    }

    public void freeze()
    {
        currentState.freeze();
    }

    public void boil()
    {
        currentState.boil();
    }

    public void condense()
    {
        currentState.condense();
    }

    //Getters and Setters
    public void setState(IState newState)
    {
        this.currentState = newState;
    }

    public void getState()
    {
        System.out.println("Current state is " + currentState.toString());
    }

    public IState getSolid()
    {
        return solid;
    }

    public IState getLiquid()
    {
        return liquid;
    }

    public IState getGas()
    {
        return gas;
    }

    public int getTemp()
    {
        return tempC;
    }

    public void setTemp(int tempC)
    {
        this.tempC = tempC;
    }

    public boolean isIce()
    {
        return isIce;
    }

    public void setIce(boolean ice)
    {
        isIce = ice;
    }

    public boolean isLiquidWater()
    {
        return isLiquidWater;
    }

    public void setLiquidWater(boolean liquidWater)
    {
        isLiquidWater = liquidWater;
    }

    public boolean isSteam()
    {
        return isSteam;
    }

    public void setSteam(boolean steam)
    {
        isSteam = steam;
    }

}
