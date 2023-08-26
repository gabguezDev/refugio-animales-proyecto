/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.refugioanimales.refugioanimales.repository;

import com.refugioanimales.refugioanimales.model.Rescatista;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRescatistaRepository extends JpaRepository<Rescatista, Long>{
    
}
