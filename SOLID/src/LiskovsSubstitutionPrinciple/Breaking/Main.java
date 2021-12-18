package LiskovsSubstitutionPrinciple.Breaking;

import java.util.List;

public class Main {
    /* This code will compile, but the free member will not be able
    * to organize a tournament, so it should not have to override that method */
    public static void main(String[] args) {
        List<Member> members = List.of(
                new PremiumMember("Jack Hores"),
                new VipMember("Tom Johns"),
                new FreeMember("Martin Vilop")
        );

        for (Member member : members) {
            member.organizeTournament();
        }
    }
}
