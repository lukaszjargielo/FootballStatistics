package com.alansystems.footballstatistics.utils;

import com.alansystems.footballstatistics.model.TeamStatistics;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class MessageProcessorTest {
    @Test
    public void testUpdateAverageGoals() {
        TeamStatistics mockTeamStatistics = mock(TeamStatistics.class);

        when(mockTeamStatistics.getSumOfGoalsScored()).thenReturn(13);
        when(mockTeamStatistics.getSumOfGoalsConceded()).thenReturn(9);
        when(mockTeamStatistics.getNumberOfPlayedEvents()).thenReturn(6);

        MessageProcessor messageProcessor = new MessageProcessor();

        messageProcessor.updateAverageGoals(mockTeamStatistics);

        verify(mockTeamStatistics, times(1)).setAverageAmountOfGoalsInTheTeamEvents(3.67);

        /*private void updateAverageGoals(TeamStatistics teamObj) {
            double averageGoals = Math.round(((teamObj.getSumOfGoalsScored() + teamObj.getSumOfGoalsConceded()) * 1.0 / teamObj.getNumberOfPlayedEvents()) * 100.0) / 100.0;
            teamObj.setAverageAmountOfGoalsInTheTeamEvents(averageGoals);*/
    }
}
