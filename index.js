import { NativeModules } from 'react-native';

const { DetectMmTextEncoding } = NativeModules;

const isUnicode = () => new Promise((resolve, reject) => {
  try {
    DetectMmTextEncoding.isUnicode(n => resolve(!!n));
  } catch (err) {
    reject(err);
  }
});

export {
  isUnicode
};
