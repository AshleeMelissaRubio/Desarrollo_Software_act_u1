package co.edu.udec.trabajosgrado.domain.events;

import java.util.Map;

public class UserCreatedDomainEvent {

    private static final String EVENT_NAME = "user.created";

    private final UserModel user;

    public UserCreatedDomainEvent(final UserModel user) {
        super(EVENT_NAME);
        this.user = user;
    }

    @Override
    public Map<String, String> payload() {
        return Map.of(
                "id", user.getId().value(),
                "name", user.getName().value(),
                "email", user.getEmail().value(),
                "role", user.getRole().name(),
                "status", user.getStatus().name());
    }
}
