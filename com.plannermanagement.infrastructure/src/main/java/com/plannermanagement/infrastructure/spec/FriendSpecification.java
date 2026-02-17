package com.plannermanagement.infrastructure.spec;

import com.plannermanagement.domain.criteria.FriendCriteria;
import com.plannermanagement.infrastructure.entity.FriendEntity;
import jakarta.persistence.criteria.Predicate;
import org.springframework.data.jpa.domain.Specification;

import java.util.ArrayList;
import java.util.List;

public class FriendSpecification {

    /**
     * Este método convierte un objeto FriendCriteria en una Specification<FriendEntity> que se puede usar para filtrar los resultados en la base de datos.
     * La Specification es una interfaz funcional que se puede implementar con una expresión lambda, y
     * se utiliza para construir consultas dinámicas basadas en los criterios proporcionados.
     * @param friendCriteria
     * @return
     */
    public static Specification<FriendEntity> from(FriendCriteria friendCriteria) {
        return (root, query, criteriaBuilder) -> {
            List<Predicate> predicates = new ArrayList<>();

            if (friendCriteria.getName() != null) {
                predicates.add(criteriaBuilder.like(root.get("name"), "%" + friendCriteria.getName() + "%"));
            }
            if (friendCriteria.getLevel() != null) {
                predicates.add(criteriaBuilder.equal(root.get("level"), friendCriteria.getLevel()));
            }
            if (friendCriteria.getState() != null) {
                predicates.add(criteriaBuilder.equal(root.get("state"), friendCriteria.getState()));
            }
            if (friendCriteria.getBirthDateMonth() != null) {
                predicates.add(criteriaBuilder.equal(criteriaBuilder.function("MONTH", Integer.class, root.get("birthDate")), friendCriteria.getBirthDateMonth())); // Aquí se utiliza la función MONTH para extraer el mes de la fecha de nacimiento es como un EXTRACT(MONTH FROM birthDate) en SQL, pero en JPQL se hace con criteriaBuilder.function, el primer parámetro es el nombre de la función, el segundo es el tipo de retorno, y el tercero es el campo al que se le aplica la función
            }
            return criteriaBuilder.and(predicates.toArray(new Predicate[0])); // Combina todas las condiciones con AND, new Predicate[0] es necesario para convertir la lista a un array de Predicates
        };
    };
};
