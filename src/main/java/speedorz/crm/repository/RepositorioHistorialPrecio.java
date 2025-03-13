package speedorz.crm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import speedorz.crm.domain.entities.HistorialPrecio;

/**
 * Repositorio para la gestión de la entidad {@link HistorialPrecio}.
 * Proporciona métodos para interactuar con la base de datos mediante JPA.
 */
@Repository
public interface RepositorioHistorialPrecio extends JpaRepository<HistorialPrecio, Long> {
}
