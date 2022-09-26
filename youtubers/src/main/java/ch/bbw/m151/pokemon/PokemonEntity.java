package ch.bbw.m151.pokemon;


import javax.persistence.*;

@Entity
public class PokemonEntity {

    @Id
    //@Column
    private int id;

    @Column
    private int number;

    @Column
    private String name;

    @Column
    private int type1;

    @Column
    private int type2;

    @Column
    private int total;

    @Column
    private int hp;

    @Column
    private int attack;

    @Column
    private int defense;

    @Column
    private int spattack;

    @Column
    private int spdefense;

    @Column
    private int speed;

    @Column
    private int generation;

    @Column
    private String legendary;

}
