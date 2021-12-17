package LiskovsSUbstitutionPrinciple.Correct;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        /* the tournament joiners are separated from tournament organizers */

        List<TournamentJoiner> members1 = List.of(
                new PremiumMember("Jack Hores"),
                new PremiumMember("Tom Johns"),
                new FreeMember("Martin Vilop")
        );

        /*  Looping this list and substituting the TournamentJoiner interface with each type of
            member works as expected and observes the LSP:
        */
        // this code respects LSP
        for (TournamentJoiner member : members1) {
            member.joinTournament();
        }

        List<TournamentOrganizer> members2 = List.of(
                new PremiumMember("Jack Hores"),
                new VipMember("Tom Johns")
                /* free member cannot organize, so it is not in this list */
        );

        // this code respects LSP
        for (TournamentOrganizer member : members2) {
            member.organizeTournament();
        }
    }
}
