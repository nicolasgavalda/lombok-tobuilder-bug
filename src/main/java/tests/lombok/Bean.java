package tests.lombok;

import lombok.Builder;
import lombok.Value;

@Value
public class Bean {

    private final int id;

    private final String name;

    private final String description;

    @Builder(toBuilder = true)
    public static Bean of(final int id, final String name, final String description) {
        final String desc = description == null ? name + " " + id : description;
        return new Bean(id, name, desc);
    }
}
