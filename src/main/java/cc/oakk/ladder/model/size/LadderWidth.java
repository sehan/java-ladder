package cc.oakk.ladder.model.size;

import java.util.Objects;

public class LadderWidth {
    private final static int MIN_WIDTH = 1;
    private final int width;

    public LadderWidth(int width) {
        if (width <= MIN_WIDTH) {
            throw new IllegalArgumentException("1보다 큰 수를 넣어주세요.");
        }
        this.width = width;
    }

    public int get() {
        return width;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof LadderWidth)) {
            return false;
        }
        LadderWidth ladderWidth = (LadderWidth) o;
        return width == ladderWidth.width;
    }

    @Override
    public int hashCode() {
        return Objects.hash(width);
    }
}
