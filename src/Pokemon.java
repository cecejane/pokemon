//this is just the pokemon class


package pkmn;

public class Pokemon {

    //the attributes that a pokemon has
    private String name = "magikarp";
    private int level = 0;

    //functions to SET these attribute

    public void setName(String name1) {
        name = name1;
    }

    public void setLevel(int level1) {
        level = level1;
    }

    //functions to GET these attributes, after they've been set

    public String getName(){
        return this.name;
    }

    public int getLevel(){
        return this.level;
    }



    //test functions
    public void testPrint(){
        System.out.println(name);
        System.out.println(level);
    }


}


