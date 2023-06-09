package presencial.clase14_DAO_medicamentos.dao;
//2
//En el DAO funcionan todas las parametrizadas que me van a permitir reemplazarlo
public interface iDao<T> {
    T guardar(T t);

}
