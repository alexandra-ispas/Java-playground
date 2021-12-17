package LiskovsSUbstitutionPrinciple.Breaking;

public class FreeMember extends Member {
    public FreeMember(String name) {
        super(name);
    }
    @Override
    public void joinTournament() {
        System.out.println("Classic member joins tournament...");
    }

    /* this method breaks Liskov's Substitution Principle
    * because the 'FreeMember' is not allowed to organize a tournament */
    @Override
    public void organizeTournament() {
        System.out.println("A free member cannot organize tournaments");
    }
}
