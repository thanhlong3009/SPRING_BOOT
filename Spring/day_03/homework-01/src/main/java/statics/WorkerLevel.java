package statics;

public enum WorkerLevel {
    LEVEL_1(1),
    LEVEL_2(2),
    LEVEL_3(3),
    LEVEL_4(4),
    LEVEL_5(5),
    LEVEL_6(6),
    LEVEL_7(7),
    ;

    public int level;

    WorkerLevel(int level) {
        this.level = level;
    }
}
