package model;

import static model.StatusType.*;

public class Exit implements Status{
    @Override
    public Status handle() {
        return null;
    }

    @Override
    public StatusType getType() {
        return EXIT;
    }
}
