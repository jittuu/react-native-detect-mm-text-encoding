#import "DetectMmTextEncoding.h"


@implementation DetectMmTextEncoding

RCT_EXPORT_MODULE()

RCT_EXPORT_METHOD(isUnicode:(RCTResponseSenderBlock)callback)
{
    CGSize kaSize = [@"က" sizeWithAttributes:@{NSFontAttributeName: [UIFont systemFontOfSize:17.0f]}];
    CGSize kakaSize = [@"က္က" sizeWithAttributes:@{NSFontAttributeName: [UIFont systemFontOfSize:17.0f]}];
    
    BOOL isUni = kakaSize.width == kaSize.width;
    callback(@[[NSNumber numberWithBool:isUni]]);
}

@end
