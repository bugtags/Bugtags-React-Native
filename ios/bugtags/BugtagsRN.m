//
//  BugtagsRN.h
//

#import "BugtagsRN.h"
#import <Bugtags/Bugtags.h>

@implementation BugtagsRN

RCT_EXPORT_MODULE()

RCT_EXPORT_METHOD(startWithAppKey:(NSString *)appKey invocationEvent:(NSInteger)invocationEvent)
{
  [Bugtags startWithAppKey:appKey invocationEvent:(BTGInvocationEvent)invocationEvent];
}

RCT_EXPORT_METHOD(setTrackingCrashes:(BOOL)trackingCrashes)
{
  [Bugtags setTrackingCrashes:trackingCrashes];
}

RCT_EXPORT_METHOD(setUserData:(NSString *)data forKey:(NSString *)key)
{
  [Bugtags setUserData:data forKey:key];
}

RCT_EXPORT_METHOD(removeUserDataForKey:(NSString *)key)
{
  [Bugtags removeUserDataForKey:key];
}

RCT_EXPORT_METHOD(removeAllUserData)
{
  [Bugtags removeAllUserData];
}

RCT_EXPORT_METHOD(addUserStep:(NSString *)content)
{
  [Bugtags addUserStep:content];
}

RCT_EXPORT_METHOD(log:(NSString *)content)
{
  [Bugtags log:content];
}

RCT_EXPORT_METHOD(sendFeedback:(NSString *)content)
{
  [Bugtags sendFeedback:content];
}

- (dispatch_queue_t)methodQueue
{
  return dispatch_get_main_queue();
}

+ (BOOL)requiresMainQueueSetup
{
  return YES;
}

@end
