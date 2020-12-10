package ladder.domain;

import java.io.PrintWriter;
import java.util.Map;

public interface Ladder {

    /**
     * memberName 위치에서 시작해서 도착한 LadderResult 를 return
     * @param memberName
     * @return
     */
    String startFrom(String memberName);

    /**
     * 모든 member 가 사다리를 타고 도착한 전체 LadderResult 를 return
     * @return
     */
    Map<String, String> startAll();

    void print(PrintWriter printWriter);

}
