import com.saggezza.cannon_game.*;
import org.junit.Test;

import static org.mockito.Mockito.*;

public class StartGameFlowTest {

@Test
    public void flowTest1(){
     IPlayerData mPlayerData = mock(PlayerData.class);
     when(mPlayerData.playerExists("chuck")).thenReturn(true);

    IDisplayFlow mDisplayFlow = mock(DisplayFlow.class);

     IStartGameFlow flowTest1 = new StartGameFlow(mPlayerData,mDisplayFlow);
    flowTest1.StartGame("chuck");

     verify(mPlayerData,times(1)).playerExists("chuck");
    }

    @Test
    public void flowTest2(){
        IPlayerData mPlayerData = mock(PlayerData.class);
        when(mPlayerData.playerExists("shilpa")).thenReturn(false);

        IDisplayFlow mDisplayFlow = mock(DisplayFlow.class);

        IStartGameFlow flowTest2 = new StartGameFlow(mPlayerData,mDisplayFlow);
        flowTest2.StartGame("shilpa");

        verify(mPlayerData,times(1)).playerExists("shilpa");

    }
    @Test
    public void flowTest3(){

        IPlayerData mPlayerData = mock(PlayerData.class);
        when(mPlayerData.playerExists("chuck")).thenReturn(false);
        IDisplayFlow mDisplayFlow = mock(DisplayFlow.class);

        IStartGameFlow flowTest2 = new StartGameFlow(mPlayerData,mDisplayFlow);
        flowTest2.StartGame("chuck");

       verify(mDisplayFlow, times(1)).leaderBoard("chuck");
    }

    @Test
    public void flowTest4(){

        IPlayerData mPlayerData = mock(PlayerData.class);
        when(mPlayerData.playerExists("shilpa")).thenReturn(false);
        IDisplayFlow mDisplayFlow = mock(DisplayFlow.class);

        IStartGameFlow flowTest2 = new StartGameFlow(mPlayerData,mDisplayFlow);
        flowTest2.StartGame("shilpa");

        verify(mDisplayFlow, times(1)).leaderBoard("shilpa");
    }
}

