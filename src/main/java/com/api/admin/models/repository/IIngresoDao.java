package com.api.admin.models.repository;

import com.api.admin.models.entity.Ingreso;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * IIngresoDao
 */
public interface IIngresoDao extends JpaRepository<Ingreso, Long> {

}