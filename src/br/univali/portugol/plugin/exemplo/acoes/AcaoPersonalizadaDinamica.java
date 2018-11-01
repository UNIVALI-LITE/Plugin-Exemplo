package br.univali.portugol.plugin.exemplo.acoes;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.AbstractAction;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Luiz Fernando Noschang
 */
public final class AcaoPersonalizadaDinamica extends AbstractAction
{
    public AcaoPersonalizadaDinamica()
    {
        super("Ação personalizada dinâmica", carregarIcone());
    }

    private static Icon carregarIcone()
    {
        try
        {
            //Carregue aqui o caminho do icone do botao do plugin que vai estar disponível
            String caminho = "br/univali/portugol/plugin/exemplo/imagens/music.png";
            Image imagem = ImageIO.read(AcaoPersonalizadaDinamica.class.getClassLoader().getResourceAsStream(caminho));

            return new ImageIcon(imagem);
        }
        catch (IOException ex)
        {
            return null;
        }
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        //Aqui estará o que seu botão fará, a ação dele
        JOptionPane.showMessageDialog(null, "O plugin executou uma ação personalizada dinâmica!!", "Plugin Exemplo", JOptionPane.INFORMATION_MESSAGE);
    }
}
