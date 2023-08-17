/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.Proyecto.Proyecto.service;

import com.Proyecto.Proyecto.domain.Usuario;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;


public interface UsuarioService {
    
    public UserDetails loadUserByNombre(String nombre) throws UsernameNotFoundException;

    public Usuario getUsuarioPorNombre(String nombre);
}
