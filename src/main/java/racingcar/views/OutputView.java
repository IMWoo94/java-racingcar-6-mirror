package racingcar.views;

import racingcar.constants.RacingCarGameComments;

public class OutputView {

    private OutputView() {

    }

    public static void racingCarOpeningComment() {
        System.out.println(RacingCarGameComments.OPENING_COMMENT);
    }

    public static void tryCountInputComment() {
        System.out.println(RacingCarGameComments.TRY_COMMENT);
    }

    public static void racingCarResultComment() {
        System.out.println(RacingCarGameComments.RESULT_COMMENT);
    }

    public static void racingCarResultPrint(String name, String dis) {
        System.out.printf("%s : %s\n", name, dis);
    }

    public static void println() {
        System.out.println();
    }
}
