import health_care_provider.errors.InvalidIdException;

public abstract class Factory {
    public abstract Object create(String[] record) throws InvalidIdException;
}
