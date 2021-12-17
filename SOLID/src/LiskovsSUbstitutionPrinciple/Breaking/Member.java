package LiskovsSUbstitutionPrinciple.Breaking;

public abstract class Member {

    private final String name;

    public Member(String name) {
        this.name = name;
    }

    /* all classes mush implement these methods, but not all the entities
    * can actually perform these actions */
    public abstract void joinTournament();
    public abstract void organizeTournament();
}
