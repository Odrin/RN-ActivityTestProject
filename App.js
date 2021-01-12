import React from 'react';
import {
  SafeAreaView,
  Button,
  NativeModules,
} from 'react-native';

const App = () => {
  return (
    <SafeAreaView>
      <Button
        title="Start activity"
        onPress={() => NativeModules.ActivityTest.start()}
      />
    </SafeAreaView>
  );
};

export default App;
