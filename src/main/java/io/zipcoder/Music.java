package io.zipcoder;

public class Music {

    private String[] playList;

    public Music(String[] playList){
        this.playList = playList;
    }

    public Integer selection(Integer startIndex, String selection){
        int startIndexBackwards = startIndex;
        int forwardCount = 0;
        int backwardCount = 0;
        while (!playList[startIndex].equals(selection)) {
            startIndex++;
            forwardCount++;
            if (startIndex >= playList.length) {
                startIndex = 0;
            }
        }
        while(!playList[startIndexBackwards].equals(selection)) {
            startIndexBackwards--;
            backwardCount++;
            if (startIndexBackwards < 0) {
                startIndexBackwards = playList.length - 1;
            }
        }
        return (Math.min(forwardCount,backwardCount));
    }
}
