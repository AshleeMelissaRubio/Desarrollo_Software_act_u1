package co.edu.udec.trabajosgrado.domain.events;

import lombok.Getter;

import java.time.LocalDateTime;
import java.util.Map;


@Getter
public abstract class DomainEvent {

    //atributos
    private final String eventName;
    private final LocalDateTime occurredOn;

    //constructor
    protected DomainEvent(final String eventName) {
        this.eventName = eventName;
        this.occurredOn = LocalDateTime.now();
    }

    //método
    public abstract Map<String, String> payload();

}
