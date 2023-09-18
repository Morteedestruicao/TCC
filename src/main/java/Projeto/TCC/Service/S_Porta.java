package Projeto.TCC.Service;

import Projeto.TCC.Model.M_Porta;
import Projeto.TCC.Resources.R_Porta;

public class S_Porta {
    private static R_Porta r_porta;

    public S_Porta(R_Porta r_porta){
        this.r_porta = r_porta;
    }
    public static M_Porta getPessoaLogin(String usuario, String senha){
        if(usuario.equals("")){
            return r_porta.findByUsuarioESenha(null,senha);
        }else{
            return r_porta.findByUsuarioESenha(Long.valueOf(usuario),senha);
        }
    }
}
