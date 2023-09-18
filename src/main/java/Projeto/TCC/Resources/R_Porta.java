package Projeto.TCC.Resources;

import Projeto.TCC.Model.M_Porta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface R_Porta extends JpaRepository<M_Porta, Long> {
    @Query(value = "SELECT * FROM pessoa WHERE usuario = :usuario and senha = :senha limit 1", nativeQuery = true)
    M_Porta findByUsuarioESenha(@Param("usuario") Long usuario, @Param("senha") String senha);
}
