package test;

import context.H20;

public class StateTester
{
    public static void main(String[] args)
    {
        H20 context = new H20(10);  //Starting as a liquid, based on temp

        context.getState();
        System.out.println();

        //Turning to a gas
        context.boil();
        context.getState();
        System.out.println(context.getTemp());
        System.out.println();

        context.melt();
        context.getState();
        System.out.println(context.getTemp());
        System.out.println();

        context.boil();
        context.getState();
        System.out.println(context.getTemp());
        System.out.println();

        context.freeze();
        context.getState();
        System.out.println(context.getTemp());
        System.out.println();

        //Turning to liquid
        context.condense();
        context.getState();
        System.out.println(context.getTemp());
        System.out.println();

        context.melt();
        context.getState();
        System.out.println(context.getTemp());
        System.out.println();

        context.condense();
        context.getState();
        System.out.println(context.getTemp());
        System.out.println();

        //Turning to solid
        context.freeze();
        context.getState();
        System.out.println(context.getTemp());
        System.out.println();

        context.boil();
        context.getState();
        System.out.println(context.getTemp());
        System.out.println();

        context.freeze();
        context.getState();
        System.out.println(context.getTemp());
        System.out.println();

        context.condense();
        context.getState();
        System.out.println(context.getTemp());
        System.out.println();

        //Turning to liquid
        context.melt();
        context.getState();
        System.out.println(context.getTemp());
        System.out.println();
    }
}
