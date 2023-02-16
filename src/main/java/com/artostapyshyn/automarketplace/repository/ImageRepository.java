package com.artostapyshyn.automarketplace.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.artostapyshyn.automarketplace.entity.Image;

@Repository
public interface ImageRepository extends JpaRepository<Image, Long> {
}
