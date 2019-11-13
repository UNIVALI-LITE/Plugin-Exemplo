package br.univali.portugol.plugin.exemplo;

import br.univali.portugol.plugin.exemplo.acoes.AcaoPersonalizadaDinamica;
import br.univali.portugol.plugin.exemplo.acoes.AcaoPersonalizadaEstatica;
import br.univali.portugol.plugin.exemplo.biblioteca.Exemplo;
import br.univali.ps.plugins.base.GerenciadorPlugins;
import br.univali.ps.plugins.base.Plugin;
import br.univali.ps.plugins.base.UtilizadorPlugins;
import br.univali.ps.plugins.base.VisaoPlugin;

/**
 *
 * @author Luiz Fernando Noschang
 */
public final class PluginExemplo extends Plugin
{
    private final VisaoPlugin visao = new VisaoPluginExemplo(this);
    
    private UtilizadorPlugins utilizador;
    
    /**
     * Construtor padrão vázio do plugin.
     */
    
    public PluginExemplo()
    {
        
    }

    @Override
    protected void inicializar(UtilizadorPlugins utilizador)
    {
        this.utilizador = utilizador;
        //Aqui você deve instalar todas as ações que seu plugin fará, ou seja, seus botões
        GerenciadorPlugins.getInstance().instalarAcaoPlugin(this, new AcaoPersonalizadaEstatica());
        GerenciadorPlugins.getInstance().instalarAcaoPlugin(this, new AcaoPersonalizadaDinamica());
        this.utilizador.registrarBiblioteca(Exemplo.class);
    }

    @Override
    public VisaoPlugin getVisao()
    {
        //retorna uma tela simples para o usuário
        return visao;
    }

    public UtilizadorPlugins getUtilizador()
    {
        return utilizador;
    }
}
