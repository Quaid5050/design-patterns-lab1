import { createNativeStackNavigator } from '@react-navigation/native-stack';

import ChatsScreen from '../screens/Chat/ChatsScreen';

const Stack = createNativeStackNavigator();

export default () => {
  return (
    <Stack.Navigator>
      <Stack.Screen name="Chats" component={ChatsScreen} />
    </Stack.Navigator>
  );
};