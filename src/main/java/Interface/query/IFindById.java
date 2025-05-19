package Interface.query;

public interface IFindById<ID, T> {
    T findById(ID id);
}