package com.plannermanagement.infrastructure.controller;

import com.plannermanagement.domain.criteria.FriendCriteria;
import com.plannermanagement.domain.model.Friend;
import org.springdoc.core.annotations.ParameterObject;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RestController;
import com.plannermanagement.service.FriendService;

import java.util.Set;

@RestController
public class FriendRestController extends RestControllerBase {
    private final FriendService friendService;
    public FriendRestController(FriendService friendService) {
        this.friendService = friendService;
    }

    @GetMapping("/friends")
    public ResponseEntity<Set<Friend>> getFriends() {
        Set<Friend> friends = friendService.findAll();
        return  ResponseEntity.ok(friends);
    }

    /**
     * Ejemplo de endpoint para buscar amigos por criterios, se asume que los criterios pueden ser nombre, edad, etc. y se pasan como parámetros de consulta (query parameters)
     * @ParameterObject se usa para indicar que los parámetros de consulta deben ser mapeados a un objeto FriendCriteria,
     * @ModelAttribute se usa para indicar que el objeto FriendCriteria debe ser creado a partir de los parámetros de consulta
     * @param criteria
     * @return
     */
    @GetMapping("/friends?{criteria}")
    public ResponseEntity<Set<Friend>> searchFriendsByCriteria(@ParameterObject @ModelAttribute FriendCriteria criteria) {
        Set<Friend> friends = friendService.searchByCriteria(criteria);
        return  ResponseEntity.ok(friends);
    }
}
