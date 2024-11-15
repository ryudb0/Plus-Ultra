class Solution {
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        int videoLen = time2Sec(video_len);
        int currentPosition = time2Sec(pos);
        int opStart = time2Sec(op_start);
        int opEnd = time2Sec(op_end);
        int[] commandsNumber = commands2Number(commands);

        currentPosition = getCurrentPosition(currentPosition, opStart, opEnd);

        for (int i : commandsNumber) {
            int tempPosition = currentPosition + i;

            if (tempPosition < 0) {
                tempPosition = 0;
            } else if (tempPosition > videoLen) {
                tempPosition = videoLen;
            }
            if (opStart <= tempPosition && tempPosition <= opEnd) {
                tempPosition = opEnd;
            }
            currentPosition = tempPosition;
        }

        return answer(currentPosition);
    }

    private static int time2Sec(String time) {
        String[] split = time.split(":");
        int minute = Integer.parseInt(split[0]);
        int second = Integer.parseInt(split[1]);
        return minute * 60 + second;
    }

    private static int[] commands2Number(String[] commands) {
        int[] commandsNumber = new int[commands.length];
        for (int i = 0; i < commands.length; i++) {
            if (commands[i].equals("next")) {
                commandsNumber[i] = 10;
            } else {
                commandsNumber[i] = -10;
            }
        }
        return commandsNumber;
    }

    private static int getCurrentPosition(int currentPosition, int opStart, int opEnd) {
        if (opStart <= currentPosition && currentPosition <= opEnd) {
            currentPosition = opEnd;
        }
        return currentPosition;
    }

    private static String answer(int currentPositionSeconds) {
        int time = sec2Time(currentPositionSeconds);
        String mmss = String.valueOf(time);
        for (int i = mmss.length(); i < 4; i++) {
            mmss = "0" + mmss;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < mmss.length(); i++) {
            sb.append(mmss.charAt(i));
            if (i == 1) {
                sb.append(":");
            }
        }

        return sb.toString();
    }

    private static int sec2Time(int currentPosition) {
        int min = currentPosition / 60;
        int sec = currentPosition % 60;
        return min * 100 + sec;
    }

}