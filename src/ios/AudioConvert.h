//
//  AudioConvert.h
//

#import <Foundation/Foundation.h>
#import <AVFoundation/AVFoundation.h>
#import <Cordova/CDV.h>

@interface AudioConvert : CDVPlugin{
    NSString* callbackId;
}

@property (nonatomic, retain) NSString* callbackId;

- (void)convertAudio:(NSArray*)arguments withDict:(NSDictionary*)options;
@end
