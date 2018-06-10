package co.com.ServiceImpl;

import co.com.Bd.BdGeneral;
import co.com.Bd.ParametrosBD;
import co.com.Objetos.Tblparametro;
import co.com.Objetos.Tblparametrodetalle;
import co.com.Service.ParametrosService;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.transaction.Transactional;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hangutco
 */
public class ParametrosServiceImpl implements ParametrosService{

    @Override
    @Transactional
    public Set findByHead(String param) {
        ParametrosBD bdGeneral = new ParametrosBD();  
        Set<Tblparametrodetalle> objDetalle = new HashSet(bdGeneral.find(param));
        return  objDetalle;
    }

    @Override
    public Tblparametrodetalle findById(int id) {
        ParametrosBD parametro = new ParametrosBD();  
        Tblparametrodetalle objDetalle = parametro.find(id);
        return  objDetalle;
    }
    
    
    
    
}
